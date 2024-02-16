import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-updateproduct',
  templateUrl: './updateproduct.component.html',
  styleUrls: ['./updateproduct.component.css']
})
export class UpdateproductComponent {
productId: number = 0;


  constructor(private productService: ProductService){

  }

  updateProduct(data: Product){

    data.id = this.productId;
  this.productService.updateProduct(data);

  }

 

}
