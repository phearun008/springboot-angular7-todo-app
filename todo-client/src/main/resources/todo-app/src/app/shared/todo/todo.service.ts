import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  api_url : String = 'http://localhost:8181';

  constructor(private http: HttpClient) { 
  }

  findAll(): Observable<any>{
    return this.http.get(`${this.api_url}/todos`);
  }
  findOne(id: number): any{
    return this.http.get(`${this.api_url}/todos/${id}`);
  }
  save(todo: any): Observable<any>{
    let result: Observable<Object>;
    result = this.http.put(`${this.api_url}/todos/${todo.id}`, todo);
    return result;
  }
  remove(id: number): Observable<any>{
    return this.http.delete(`${this.api_url}/todos/${id}`);
  }

}
