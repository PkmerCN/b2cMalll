package org.hzz.domain;

/**
 * 命令处理器
 * @author 胖卡
 * @version 1.0.0
 * @date 2024/6/19
 */
public interface CommandHandler<T,R> {
    /**
     * 命令执行
     *
     * @param requestParam
     * @return
     */
    R handler(T requestParam);
}
