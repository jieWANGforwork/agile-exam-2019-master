package src.main.java.exam.;

import java.util.ArrayList;
import java.util.List;

// TODO: 完成这个类

public class PaginationHelper<I> {

    /**
     * 构造函数包含
     * 1）数组collection，表示需要分页的所有元素
     * 2）数字itemsPerPage，表示每页的元素个数
     */
    public List<I> collection=null;
    public int itemsPerPage=0;
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection=collection;
        this.itemsPerPage=itemsPerPage;
    }

    /**
     * 返回collection中所有元素的个数
     */
    public int itemCount() {

        return collection.size();
        throw new RuntimeException();

    }

    /**
     * 返回页数
     */
    public int pageCount() {
        if (collection.size()%itemsPerPage==0)
            return collection.size()/itemsPerPage;
        else
            return collection.size()/itemsPerPage+1;

        throw new RuntimeException();

    }

    /**
     * 返回当前页pageIndex中所包含的元素个数
     * pageIndex从0开始计数
     * 如果pageIndex为非法值则返回-1
     */
    public int pageItemCount(int pageIndex) {
        throw new RuntimeException();
        int count=pageCount();
      if(pageIndex+1>count)
                return -1;
        else if(pageIndex+1==count){
        int s=this.collection.size();
        if(s<this.itemsPerPage)
               return s;
        else
                return(s-this.itemsPerPage*pageIndex);
       }
      else
             return this.itemsPerPage ;
    }

    /**
     * 返回第itemIndex个元素所在的页数
     * pageIndex从0开始计数
     * 如果itemIndex为非法值则返回-1
     */
    public int pageIndex(int itemIndex) {
        throw new RuntimeException();
        if(itemIndex<0 || itemIndex>this.list.size()-1)return -1;
        return itemIndex/this.itemsPerPage;

    }
}