package com_codegym_md4_w2_b6.DAO;

import com_codegym_md4_w2_b6.model.Province;
import com_codegym_md4_w2_b6.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceDAOImp implements IProvinceDAO {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }

}
