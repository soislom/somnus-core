package cn.lemon.core.factory;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import cn.lemon.core.OperateLog;
import cn.lemon.core.annotation.Operate;
import cn.lemon.core.enume.OperateEnum;
import cn.lemon.core.enume.ResultEnum;
import cn.lemon.core.util.DateUtil;

@Aspect
public abstract class OperateLogAdvice {

    @Around(value = "@annotation(cn.lemon.core.annotation.Operate)")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 1.方法执行前的处理，相当于前置通知
        // 获取方法签名
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        // 获取方法
        Method method = methodSignature.getMethod();
        // 获取方法上面的注解
        Operate Operate = method.getAnnotation(Operate.class);

        // 获取操作描述的属性值
        String context = Operate.context();
        OperateEnum operateEnum = Operate.operateEnum();

        OperateLog operateLog = new OperateLog();
        operateLog.setContext(context);
        operateLog.setCreateTime(DateUtil.getDate());
        operateLog.setType(operateEnum.toString());

        Object result = null;

        try {
            // 让代理方法执行
            result = proceedingJoinPoint.proceed();
            // 2.相当于后置通知(方法成功执行之后走这里)
            operateLog.setResult(ResultEnum.SUCCESS.getMessage());
        } catch (Exception e) {
            operateLog.setResult(ResultEnum.ERROR.getMessage());
        } finally {
            doService(operateLog);
        }
        return result;
    }

    /**
     * operatelog 持久化
     * 
     * @param operateLog
     */
    public void doService(OperateLog operateLog) {
//        operateLogMapper.insert(operateLog);
    }
}
