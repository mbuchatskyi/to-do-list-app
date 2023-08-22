package mbuchatskyi.service;

import java.util.List;

import mbuchatskyi.model.State;

public interface StateService {
    State create(State state);
    State readById(long id);
    State update(State state);
    void delete(long id);

    State getByName(String name);
    List<State> getAll();
}
