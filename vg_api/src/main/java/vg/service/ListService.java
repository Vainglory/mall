package vg.service;

import vg.bean.BaseAttrInfo;
import vg.bean.SkuLsInfo;
import vg.bean.SkuLsParam;

import java.util.HashSet;
import java.util.List;

public interface ListService {
public List<SkuLsInfo> search(SkuLsParam skuLsParam);
//    List<BaseAttrInfo> getAttrListByValueId(HashSet<String> strings);
}
