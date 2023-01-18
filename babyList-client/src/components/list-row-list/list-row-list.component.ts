import {Component, OnInit} from '@angular/core';
import {ListRow} from "../../classes/listRow";
import {ListRowService} from "../../services/listRow.service";

@Component({
  selector: 'app-list-row-list',
  templateUrl: './list-row-list.component.html',
  styleUrls: ['./list-row-list.component.css']
})
export class ListRowListComponent implements OnInit{

  public listRowArray: ListRow[] = [];

  constructor(private listRowService:ListRowService) {
  }

  ngOnInit(): void {
    this.listRowService.findAll().subscribe( data => {
      this.listRowArray = data;
    });
  }
}
