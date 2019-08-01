# TodoApp

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 8.1.3.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.


## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).


#For DEPLOYMENT
1. Run command in todo-client: ng build --prod --deploy-url /resources/
2. Add base-href url if the project has `contextPath` : --base-href /todo/  
3. Copy file in `dist` folder to `static` in project `todo-web` and move `index.html` file to the `templates` folder.
4. Configure resource mapping in Spring project.

#Using assets
1. use folder `./assets/**` to references resources no matter where current location you're. ex: <img src="./assets/image/todo.jpg" width="100px">

#Command
1. ng build --prod --deploy-url /resources/    (/resources/ => use as root)
2. ng build --prod --deploy-url resources/ --base-href /todo/   (resources/ use as relative path)


#deploy angular project directly(dist folder) to tomcat and war
1. war: can mapped url when refresh browser
2. dist: cann't map url when refresh browser
