package com_codegym_md4_w2_b6.DAO;

import com_codegym_md4_w2_b6.model.Province;

public interface IProvinceDAO {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
