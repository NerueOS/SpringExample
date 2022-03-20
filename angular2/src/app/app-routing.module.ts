import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormLibroComponent } from './form-libro/form-libro.component';
import { FormLibro2Component } from './form-libro2/form-libro2.component';
import { LibroListComponent } from './libro-list/libro-list.component';

const routes: Routes = [
  { path: 'libri', component: LibroListComponent },
  { path: 'libri/save', component: FormLibroComponent},
  { path: 'libri/save2', component: FormLibro2Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
