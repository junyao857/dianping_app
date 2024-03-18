package com.ifly.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ifly.dto.Result;
import com.ifly.entity.VoucherOrder;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);
}
