import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LibroListComponent } from './libro-list/libro-list.component';
import { LibroService } from './service/libro-service.service';
import { FormLibroComponent } from './form-libro/form-libro.component';
import { FormLibro2Component } from './form-libro2/form-libro2.component';
import { FilterTitoloPipe } from './pipes/filter-titolo.pipe';
import { FilterEditorePipe } from './pipes/filter-editore.pipe';
import { FilterAutorePipe } from './pipes/filter-autore.pipe';

@NgModule({
  declarations: [
    AppComponent,
    LibroListComponent,
    FormLibroComponent,
    FormLibro2Component,
    FilterTitoloPipe,
    FilterEditorePipe,
    FilterAutorePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [LibroService],
  bootstrap: [AppComponent]
})
export class AppModule { }
