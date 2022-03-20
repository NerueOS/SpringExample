import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IdResult } from '../model/idResult';
import { Libro } from '../model/libro';
import { LibroService } from '../service/libro-service.service';

@Component({
  selector: 'app-libro-list',
  templateUrl: './libro-list.component.html',
  styleUrls: ['./libro-list.component.css']
})
export class LibroListComponent implements OnInit {

  errorMessage: String;
  libri: Libro[];

  filteredStringTitolo: String;
  filteredStringEditore: String;
  filteredStringAutore: String;

  constructor(
    private route: ActivatedRoute, 
    private router: Router, 
    private libroService: LibroService) { }

  ngOnInit(): void {
    this.libroService.loadLibri().subscribe(data => {this.libri = data, console.log(data)});
  }

  removeLibro(idLibro: Number): void {
    
    this.libroService.removeLibro(idLibro).subscribe(
      (idResult: IdResult) => {
        if (idResult.idLibro > 0) {
          //this.gotoLibriList()
          this.libroService.loadLibri().subscribe(data => {this.libri = data, console.log(data)});
        } else {
          this.errorMessage = "Errore!"
        }
        console.log(idResult)})
  }

  gotoLibriList() {
    this.router.navigate(['libri']).then(()=>window.location.reload());
  }

  sortBy(value: string): void {
    switch(value) {

      case 'idLibro': this.libri.sort((a, b) => a.idLibro - b.idLibro);
      break;

      case 'idLibroDec': this.libri.sort((a, b) => b.idLibro - a.idLibro);
      break;

      case 'titolo': this.libri.sort((a, b) => a.titolo.localeCompare(b.titolo))
      break;

      case 'titoloDec': this.libri.sort((a, b) => b.titolo.localeCompare(a.titolo))
      break;

      case 'editore': this.libri.sort((a, b) => a.editore.localeCompare(b.editore))
      break;

      case 'editoreDec': this.libri.sort((a, b) => b.editore.localeCompare(a.editore))
      break;

      case 'autore': this.libri.sort((a, b) => a.autore.localeCompare(b.autore))
      break;

      case 'autoreDec': this.libri.sort((a, b) => b.autore.localeCompare(a.autore))
      break;

      case 'stato': this.libri.sort((a, b) => (a.stato?1:0) - (b.stato?1:0))
      break;

      case 'statoDec': this.libri.sort((a, b) => (b.stato?1:0) - (a.stato?1:0))
      break;
    }
    
  }
}
