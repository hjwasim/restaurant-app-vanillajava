package services;

import repositories.ReadOnlyRepository;
import repositories.Repository;

public abstract class ReadOnlyBaseService<TE, T> {
    private final Repository<TE, T> repository;
    ReadOnlyBaseService(ReadOnlyRepository<TE, T> repository) {
        this.repository = (Repository<TE, T>) repository;
    }
}
