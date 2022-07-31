package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentHibernate;

import java.util.Collection;

@Service
public class AccidentService {

    private AccidentHibernate store;

    public AccidentService(AccidentHibernate store) {
        this.store = store;
    }

    public Collection<Accident> getAccidents() {
        return store.getAccidents();
    }

    public void addAccident(Accident accident) {
        store.addAccident(accident);
    }

    public Accident findByIdAccident(int id) {
        return store.findByIdAccident(id);
    }

    public void update(Accident accident) {
        store.update(accident);
    }
}
