/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.vendingmachine.dao;

import com.hg.vendingmachine.dto.Item;

import java.util.List;

/**
 *
 * @author kristinazakharova
 */
public interface VendingMachineDao {

    public List<Item> readAllItems() throws VendingMachinePersistenceException;

    public Item readById(String itemId) throws VendingMachinePersistenceException;

    public void updateInventory(String itemId, Item item) throws VendingMachinePersistenceException;
}
