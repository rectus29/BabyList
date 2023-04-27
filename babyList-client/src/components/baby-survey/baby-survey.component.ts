import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {SurveyService} from "../../services/survey.service";
import {Sexe, Survey} from "../../classes/survey";
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-baby-survey',
  templateUrl: './baby-survey.component.html',
  styleUrls: ['./baby-survey.component.css']
})
export class BabySurveyComponent implements OnInit{
  survey: Survey = new Survey();
  sexeList : Sexe[] = [Sexe.MASCULIN, Sexe.FEMININ,Sexe.BOTH];

  constructor(
    private toastr: ToastrService,
    private route: ActivatedRoute,
    private router: Router,
    private surveyService: SurveyService,
    ) {
  }

  onSubmit() {
    this.toastr.success('Hello world!', 'Toastr fun!');
    this.surveyService.save(this.survey)
      .subscribe({
        next : rtrn => {
          this.survey = rtrn;
        },
        error : err => {}
    });
  }

  ngOnInit(): void {
  }

}
