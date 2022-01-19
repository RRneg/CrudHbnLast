package com.sasha.CRUDwithHbn.service;


import com.sasha.CRUDwithHbn.model.Writer;
import com.sasha.CRUDwithHbn.repository.WriterRepository;
import com.sasha.CRUDwithHbn.repository.gbn.GBNWriterRepositoryImpl;


import java.util.List;

public class WriterService {

    private WriterRepository writerRepository;

    public WriterService() {
        this.writerRepository = new GBNWriterRepositoryImpl();
    }

    public WriterService(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }


    public Writer getById(Integer id) {
        return writerRepository.getById(id);
    }

    public Writer update(Writer writer) {
        return writerRepository.update(writer);
    }

    public void deleteById(Integer id) {
        writerRepository.deleteById(id);
    }

    public List<Writer> getAll() {
        return writerRepository.getAll();
    }

    public Writer save(Writer writer) {
        return writerRepository.save(writer);
    }

}
