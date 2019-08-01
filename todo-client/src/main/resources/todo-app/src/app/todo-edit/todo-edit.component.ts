import { Component, OnInit } from '@angular/core';
import { TodoService } from '../shared/todo/todo.service';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-todo-edit',
  templateUrl: './todo-edit.component.html',
  styleUrls: ['./todo-edit.component.css']
})
export class TodoEditComponent implements OnInit {

  todo: any;
  isEdit: boolean = false;
 
  constructor(private todoService: TodoService,private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    console.log('this is todo-edit-component!');
    this.route.params.subscribe(params=>{
        let id = params['id'];
        
        this.isEdit = true;
        console.log('route_param', id);
        this.todoService.findOne(id).subscribe(data=>{
            console.log(data);
            this.todo = data;
        });
    });
  }

  save(form: NgForm) {
    console.log('form', form);
    this.todoService.save(form).subscribe(data=>{
        console.log('save_status', data);
        this.goHome();
    });
  }

  remove(id: number){
    console.log('id', id);
    this.todoService.remove(id).subscribe(data =>{
        console.log('remove_status', data);
        this.goHome();
    });
  }
  goHome(){
    this.router.navigate(["/todo-list"]);
  }

}
