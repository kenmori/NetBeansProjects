/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author moritakenji
 */
public class FooSub implements Foo{
    String name;
    FooSub(String name){
        this.name = name;
    }
    @Override
    public String say(String name){
        System.out.println(name);
        return name;
    }
}
