package com.dxctraining.inventorymgt.supplier.service;

import java.util.List;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public interface ISupplierService {
	void add(Supplier supplier);

	void remove(int id);

	Supplier findSupplierById(int id);

	List<Supplier> displayAllSuppliers();


}
