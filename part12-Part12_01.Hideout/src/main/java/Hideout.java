/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mąż
 */
public class Hideout<T> {

    private T t;

    public void putIntoHideout(T toHide) {
        t = toHide;
    }

    public T takeFromHideout() {
        T thing = t;
        t = null;
        return thing;
    }

    public boolean isInHideout() {
        return !(t == null);
    }
}
