import { Observable } from 'rxjs';
import { CustomerService } from './customer.service';
import { Customer } from './customer';
import { Component, OnInit, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { MatPaginator, MatTableDataSource } from '@angular/material';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent implements OnInit{
  title = 'Jumia Tech Challenge';

  displayedColumns: string[] = ['Name', 'Country', 'Country Code', 'Phone', 'State'];
  dataSource: MatTableDataSource<Customer>;
  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;
  customerList: Customer[] = [];

  constructor(private customerService: CustomerService, private router: Router) {
  }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    // this.customers = this.customerService.getCustomersList();
    this.customerService.getCustomersList().subscribe((result) => {
      this.customerList = result;
      this.dataSource = new MatTableDataSource(this.customerList);
      this.dataSource.paginator = this.paginator;
    });
  }

  doFilter = (value: string) => {
    this.dataSource.filter = value.trim().toLocaleLowerCase();
  }
}
