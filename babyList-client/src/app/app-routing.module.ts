import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ListRowListComponent} from "../components/list-row-list/list-row-list.component";

const routes: Routes = [
  {path:'listrow', component: ListRowListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
