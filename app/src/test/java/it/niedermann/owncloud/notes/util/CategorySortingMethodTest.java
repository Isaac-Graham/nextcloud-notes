package it.niedermann.owncloud.notes.util;

import org.junit.Test;

import it.niedermann.owncloud.notes.util.CategorySortingMethod;

import static org.junit.Assert.*;

public class CategorySortingMethodTest {

    // CS304(manually written) Issue link: https://github.com/stefan-niedermann/nextcloud-notes/issues/603
    @Test
    public void getCSMID() {
        CategorySortingMethod csm0 = CategorySortingMethod.SORT_MODIFIED_DESC;
        assertEquals(0, csm0.getCSMID());
        CategorySortingMethod csm1 = CategorySortingMethod.SORT_LEXICOGRAPHICAL_ASC;
        assertEquals(1, csm1.getCSMID());
    }

    // CS304(manually written) Issue link: https://github.com/stefan-niedermann/nextcloud-notes/issues/603
    @Test
    public void getSOrder() {
        CategorySortingMethod csm0 = CategorySortingMethod.SORT_MODIFIED_DESC;
        assertEquals("MODIFIED DESC", csm0.getSorder());
        CategorySortingMethod csm1 = CategorySortingMethod.SORT_LEXICOGRAPHICAL_ASC;
        assertEquals("TITLE ASC", csm1.getSorder());
    }

    // CS304(manually written) Issue link: https://github.com/stefan-niedermann/nextcloud-notes/issues/603
    @Test
    public void getCSM() {
        CategorySortingMethod csm0 = CategorySortingMethod.SORT_MODIFIED_DESC;
        assertEquals(csm0, CategorySortingMethod.getCSM(0));
        CategorySortingMethod csm1 = CategorySortingMethod.SORT_LEXICOGRAPHICAL_ASC;
        assertEquals(csm1, CategorySortingMethod.getCSM(1));
    }
}

