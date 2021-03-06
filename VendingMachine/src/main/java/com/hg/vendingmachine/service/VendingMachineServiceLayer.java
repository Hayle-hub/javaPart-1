/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.vendingmachine.service;

import com.hg.vendingmachine.dao.VendingMachinePersistenceException;
import com.hg.vendingmachine.dto.Change;
import com.hg.vendingmachine.dto.Item;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author hayle
 */
public interface VendingMachineServiceLayer {

    public List<Item> getAvailableItems() throws VendingMachinePersistenceException;

    public Item getItemById(String itemId) throws VendingMachinePersistenceException;

    public void updateInventory(String itemId, Item item) throws VendingMachinePersistenceException;

    public void setBalance(BigDecimal balance);

    public BigDecimal getBalance();

    public Change vend(String itemId) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineOutOfStockException;

    public Change calculateChange(BigDecimal changeToCalculate);
}
