package vg.service;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import vg.bean.SkuInfo;
import vg.bean.SpuSaleAttr;

import java.util.List;

public interface SkuService {


    List<SkuInfo> skuInfoListBySpu(String spuId);

    void saveSku(SkuInfo skuInfo);

    SkuInfo getSkuById(String skuId);

    List<SpuSaleAttr> getSpuSaleAttrListCheckBySku(String spuId,String skuId);

    List<SkuInfo> getSkuSaleAttrValueListBySpu(String spuId);

    List<SkuInfo> getSkuByCatalog3Id(int catalog3Id);
}
