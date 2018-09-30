package vg.service;

import vg.bean.BaseSaleAttr;
import vg.bean.SpuImage;
import vg.bean.SpuInfo;
import vg.bean.SpuSaleAttr;

import java.util.List;

public interface SpuServcie {

    List<BaseSaleAttr> baseSaleAttrList();

    void saveSpu(SpuInfo spuInfo);

    List<SpuInfo> spuList(String catalog3Id);

     List<SpuSaleAttr> spuSaleAttrList(String spuId);

    List<SpuImage> spuImageList(String spuId);
}
