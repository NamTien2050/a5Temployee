package service;

import model.FPTemployee;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ITemployeeRepo;

import java.util.ArrayList;

public class TemployeeService implements ITemployeeService {
    @Autowired
    ITemployeeRepo iTemployeeRepo;

    @Override
    public FPTemployee findById(long id) {
        return iTemployeeRepo.findById(id).get();
    }

    @Override
    public ArrayList<FPTemployee> findAll() {
        return (ArrayList<FPTemployee>) iTemployeeRepo.findAll();
    }

    @Override
    public FPTemployee save(FPTemployee fpTemployee) {
        return iTemployeeRepo.save(fpTemployee);
    }

    @Override
    public void delete(FPTemployee fpTemployee) {
        iTemployeeRepo.delete(fpTemployee);
    }

    @Override
    public ArrayList<FPTemployee> findByName(String ten) {
        return iTemployeeRepo.findAllByName(ten);
    }
}
