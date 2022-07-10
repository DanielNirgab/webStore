package model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> idLsit) {
        items.addAll(idLsit);
        return idLsit;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }

}
