import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IdResult } from '../model/idResult';
import { Libro } from '../model/libro';
import { LibroService } from '../service/libro-service.service';

@Component({
  selector: 'app-form-libro2',
  templateUrl: './form-libro2.component.html',
  styleUrls: ['./form-libro2.component.css']
})
export class FormLibro2Component {

  errorMessage: string;
  libro: Libro;
  
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private libroService: LibroService
  ) { 
    this.libro = new Libro();
    this.errorMessage = "";
  }

  onSubmit(): void {
    this.libroService.addLibro(this.libro).subscribe(
      (idResult: IdResult) => {
        if (idResult.idLibro > 0) {
          this.gotoLibriList()
        } else {
          this.errorMessage = "Errore!"
          this.gotoAddLibroForm()
        }
        console.log(idResult)
      })  
  }

  gotoLibriList() {
    this.router.navigate(['libri']);
  }

  gotoAddLibroForm() {
    this.router.navigate(['libri/save2']);
  }
}
