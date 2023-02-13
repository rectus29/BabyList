import { Component } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {SurveyService} from "../../services/survey.service";
import {Survey} from "../../classes/survey";

@Component({
  selector: 'app-baby-survey',
  templateUrl: './baby-survey.component.html',
  styleUrls: ['./baby-survey.component.css']
})
export class BabySurveyComponent {
  survey: Survey;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private surveyService: SurveyService) {
    this.survey = new Survey();
  }

  onSubmit() {
    this.surveyService.save(this.survey)/*.subscribe(result => this.gotoUserList())*/;
  }

  gotoUserList() {
    this.router.navigate(['/users']);
  }
}
