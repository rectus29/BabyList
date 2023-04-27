import {Injectable} from '@angular/core';
import {Survey} from "../classes/survey";
import {catchError, Observable} from "rxjs";
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from "../environements/environment";

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Authorization': 'Basic ' + btoa('admin:admin')
  })
};

@Injectable({
  providedIn: 'root'
})
export class SurveyService {

  constructor(private http: HttpClient) {
  }

  save(survey: Survey): Observable<any> {
    return this.http.post<Survey>(
      environment.apiUrl + "/api/v1/surveys",
      survey,
      {headers : httpOptions.headers}
    );


    return new Observable<Survey>();
  }
}
