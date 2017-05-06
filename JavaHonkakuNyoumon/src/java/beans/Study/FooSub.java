/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.Study;

import beans.Study.Foo;

/**
 *
 * @author moritakenji
 */
public class FooSub implements Foo{
    private String name;
    FooSub(String name){
        this.name = name;
    }
    @Override
    public String say(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
