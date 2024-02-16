import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from './product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private _http:HttpClient) { }

    baseUrl = 'http://localhost:3000/products/';


    getAll() : Observable<Product[]> {

     return   this._http.get<Product[]>(this.baseUrl);

    }

    getByName(name: string): Observable<Product[]> {
      const url = `${this.baseUrl}?name=${name}`; 
      return this._http.get<Product[]>(url);
    }
    

    insertProduct(product : Product) {

          this._http.post<Product>(this.baseUrl,product)
          .subscribe(  (response) => { console.log('product added', response )})

    }

    updateProduct(product: Product) {
      const url = `${this.baseUrl}${product.id}`;
      this._http.put<Product>(url, product)
        .subscribe((response) => {
          console.log('Product updated', response);
        });
    }
    

   


    deleteProductById(id: number) {
    {

        this._http.delete<Product>(this.baseUrl+id)
          .subscribe( (data) => { console.log(id +"record deleted");}, err => { console.log(err)});

    }


  }
}
