package service;

import model.FPTemployee;

import java.util.ArrayList;

public interface ITemployeeService {
    FPTemployee findById(long id);

    ArrayList<FPTemployee> findAll();

    FPTemployee save(FPTemployee fpTemployee);

    void delete(FPTemployee fpTemployee);

    ArrayList<FPTemployee> findByName(String ten);
}
