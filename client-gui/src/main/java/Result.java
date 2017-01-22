/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Result {

    private String url;
    private String title;

    public Result(String title, String url){

        this.url = url;
        this.title = title;
    }

    public String getUrl(){

        return url;
    }

    public String getTitle(){

        return title;
    }

    @Override
    public String toString(){

        return url;
    }

    @Override
    public boolean equals(Object o){

        if(o instanceof Result == false)

            return false;

        return getUrl().equals(((Result)o).getUrl());
    }
}