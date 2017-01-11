/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class SetBookData {
//   static final Arrays books = new Arrays();

    private List<DefineBookData> books;
//   static {
//       private String title;
//       private String exp;
//       private String isbn;
//       private Integer price;
//   }
    {
        books = new ArrayList<>();
        books.add(new DefineBookData(
                "978-4-7980-4161-2", "Androidアプリ開発 パーフェクトマスター", 3200, "AndroidStudioによるアプリ開発"
        ));
         books.add(new DefineBookData(
                "978-4-7980-3856-8", "世界で一番簡単なSQLの本", 1600, "SQLの基本を解説"
        ));
          books.add(new DefineBookData(
                "978-4-7980-4327-2", "Execlビジネス統計　パーフェクトマスター", 3200, "Execlによる統計解析"
        ));
        books.add(new DefineBookData(
                "978-4-7980-4242-8", "ホームページ・ビルダー19", 2980, "HBによるweb代と構築"
        ));
        books.add(new DefineBookData(
                "978-4-7980-3884-1", "世界で一番簡単なHTML5&CSSの本", 1400, "HTMLとCSSの使い方を学べる入門書"
        ));
        
    }
    public List <DefineBookData> getBooks(){
        return books;
    }
    public void setBooks(List<DefineBookData> books){
        this.books = books;
    }
//    books.push(title);
}
