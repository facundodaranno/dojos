package com.mercadolibre.dojos;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Tests for the dojo.
 */
public class DojoTest {
	
	@Before
	public void setup() {
	}
	
	@Test
	@Ignore
	public void test_dummy() {
	}

	@Test
	public void testGetProfitFromCostAndSellingPrice_shouldReturn100(){
		Item item = new Item( new Cost(100.00), new SellingPrice(200.00) );
		assertEquals( item.getProfit(), (Double) 100.00 );
	}

	@Test
	public void testGetProfitFromASelling_shouldReturnX(){
		Item item = new Item( new Cost(100.00), new SellingPrice(200.00) );
		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add( item );
		itemList.add( item );
		Selling selling = new  Selling( itemList );



		assertEquals( selling.calculateProfit(), new Profit(50) );
	}

	/*

	describe("checkout", () => {
    describe("dummy", function () {
        it("dummy", () => {
            var item = new Item(new Cost(100));
            var selling = new Selling([item] , new SellingPrice(150))
            chai.assert.isTrue(selling.calculateProfit().equals(new Profit(50)));
        });
    });

    describe("buy one and sell two", function () {
        it("buy one and sell two", () => {
            var item = new Item(new Cost(100));
            var selling = new Selling([item,item],  new SellingPrice(250));

            chai.assert.isTrue(selling.calculateProfit().equals(new Profit(50)));
        });
    });


	*/
}
