package com.example.dynamic.aspect.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    /***
     *  使用JoinPoint接口作为参数获取目标对象的信息
     * 前置通知：就是在目标方法执行之前实现增强，可以实现权限管理
     */
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知：模拟权限控制");
        System.out.println("目标对象：" + joinPoint.getTarget() + "被增强处理的方法：" +
                "" + joinPoint.getSignature().getName());
    }

    /***
     * 后置返回通知：是在目标方法执行成功后实现增强，可实现关闭流，或者是删除文件等处理
     */
    public void afterReturning(JoinPoint joinPoint)  {
        System.out.println("后置通知：模拟删除临时文件");
        System.out.println("目标对象：" + joinPoint.getTarget() + "被增强处理的方法：" +
                "" + joinPoint.getSignature().getName());
    }

    /***
     * 环绕通知：在目标方法执行前后实现增强，用于日志记录，和事务处理等功能
     * @param proceedingJoinPoint 代表可执行的目标方法
     * @return 返回值的类型必须是object
     * @throws Throwable
     */
    public Object around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable {
        //开始
        System.out.println("环绕开始 执行目标方法之前 模拟开启事务");
        //执行当前的目标方法
        Object obj = proceedingJoinPoint.proceed();
        //结束
        System.out.println("环绕结束 执行目标方法之后 模拟关闭事务");

        return obj;
    }

    /***
     * 异常通知 是在方法执行出现异常的时候实施增强，可以用于异常处理，日志记录等
     * @param throwable
     */
    public void except(Throwable throwable){
        System.out.println("异常通知："+"程序执行异常"+ throwable.getMessage());


    }

    /***
     * 后置通知：实在目标方法执行之后实施增强 不管是不是出现异常 都会执行
     */
    public void after(){
        System.out.println("最终通知："+"释放资源");

    }

}
