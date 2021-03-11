package com_codegym_md4_w2_b6.formatter;

import com_codegym_md4_w2_b6.DAO.ProvinceDAOImp;
import com_codegym_md4_w2_b6.model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ProvinceFormatter implements Formatter<Province> {

    private ProvinceDAOImp provinceDAOImp;

    @Autowired
    public ProvinceFormatter(ProvinceDAOImp provinceDAOImp) {
        this.provinceDAOImp = provinceDAOImp;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        return provinceDAOImp.findById(Long.parseLong(text));
    }

    @Override
    public String print(Province object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}
