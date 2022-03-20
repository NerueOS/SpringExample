import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { AnyCatcher } from 'rxjs/internal/AnyCatcher';
import { Libro } from '../model/libro';
import { LibroService } from '../service/libro-service.service';

@Component({
  selector: 'app-form-libro',
  templateUrl: './form-libro.component.html',
  styleUrls: ['./form-libro.component.css']
})
export class FormLibroComponent implements OnInit {

  libroForm: any;

  constructor(private fb: FormBuilder,
              private service: LibroService) { }

  ngOnInit(): void {

    this.libroForm = this.fb.group({
      titolo: ["", [Validators.required] ],
      editore: ["", [Validators.required] ],
      autore: ["", [Validators.required] ]
    })
  }

  onSubmit(): void {

    const libro: Libro = this.libroForm.value;
    console.log(libro);

    this.service.addLibro(libro).subscribe(data => console.log(data));
  }

}
