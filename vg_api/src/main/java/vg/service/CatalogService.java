package vg.service;

import vg.bean.BaseCatalog1;
import vg.bean.BaseCatalog2;
import vg.bean.BaseCatalog3;

import java.util.List;

public interface CatalogService {
    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(String catalog1Id);

    List<BaseCatalog3> getCatalog3(String catalog2Id);
}
