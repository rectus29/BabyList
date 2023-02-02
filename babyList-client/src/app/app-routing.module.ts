import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ListRowListComponent} from "../components/list-row-list/list-row-list.component";
import {UsersListComponent} from "../components/users-list/users-list.component";
import {BabySurveyComponent} from "../components/baby-survey/baby-survey.component";

const routes: Routes = [
  {path:'listrow', component: ListRowListComponent},
  {path:'listuser', component: UsersListComponent},
  {path:'survey', component: BabySurveyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
