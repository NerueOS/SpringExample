import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Libro } from '../model/libro';
import { IdResult } from '../model/idResult';

@Injectable()
export class LibroService {

  private libriUrl: string;

  constructor(private http: HttpClient) {
    this.libriUrl = 'http://localhost:8080/ws-libri/';
  }

  public loadLibri(): Observable<Libro[]> {
    return this.http.get<Libro[]>(this.libriUrl + "load-list-libri");
  }

  public addLibro(libro: Libro): Observable<IdResult> {
    return this.http.post<IdResult>(this.libriUrl + "add-libro", libro);
  }

  public removeLibro(idLibro: Number): Observable<Libro> {
    return this.http.get<Libro>(this.libriUrl + "remove-libro?idLibro=" + idLibro)
  }
}