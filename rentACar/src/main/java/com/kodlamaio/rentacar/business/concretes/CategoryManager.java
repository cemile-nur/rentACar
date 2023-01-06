package com.kodlamaio.rentacar.business.concretes;

import com.kodlamaio.rentacar.business.abstracts.ICategoryService;
import com.kodlamaio.rentacar.business.requests.CreateBrandRequest;
import com.kodlamaio.rentacar.business.responses.GetAllBrandsResponse;

import java.util.List;

public class CategoryManager implements ICategoryService {
    @Override
    public List<GetAllBrandsResponse> getAll() {
        return null;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

    }
}
