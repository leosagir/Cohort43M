package code.library.service;

import code.withCollections.entity.Reader;
import code.library.repository.ReaderRepository;

public class ReaderService {

    private ReaderRepository repository;

    public ReaderService(ReaderRepository repository) {
        this.repository = repository;
    }

    public boolean addReader(Reader reader) {


            boolean addResult = repository.add(reader);
            return addResult;

    }

    public Reader findById(int id){
        return repository.findById(id);
    }




}
