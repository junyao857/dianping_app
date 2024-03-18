package com.ifly.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ifly.dto.Result;
import com.ifly.entity.Voucher;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
