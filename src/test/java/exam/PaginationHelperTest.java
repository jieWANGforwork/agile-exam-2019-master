package exam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class PaginationHelperTest {

    private PaginationHelper helper;

    @Before
    public void setup() {
        helper = new PaginationHelper(Arrays.asList('x', 'j', 't', 'u', 's', 'e'), 4);
    }


    @Test
    public void ShouldGetItemCount() {
        Assert.assertEquals(6, helper.itemCount());
    }

    @Test
    public void ShouldGetPageCount() {
        Assert.assertEquals(2, helper.pageCount());
    }

    @Test
    public void ShouldGetPageItemCount() {
        Assert.assertEquals(4, helper.pageItemCount(0));
        Assert.assertEquals(2, helper.pageItemCount(1));
        Assert.assertEquals(-1, helper.pageItemCount(2));
    }

    @Test
    public void ShouldGetPageIndex() {
        /**
         *  TODO：请使用Assert语句描述以下测试
         * helper.pageIndex(5); //should == 1 (zero based index)
         * helper.pageIndex(2); //should == 0
         * helper.pageIndex(20); //should == -1
         * helper.pageIndex(-10); //should == -1
         */
        Assert.assertEquals(1, helper.pageIndex(5));
        Assert.assertEquals(0, helper.pageIndex(2));
        Assert.assertEquals(-1, helper.pageIndex(20));
        Assert.assertEquals(-1, helper.pageIndex(-10));
    }

}
