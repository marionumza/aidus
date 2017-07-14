package com.gvs.modelos;

import android.os.Parcel;
import android.os.Parcelable;

public class Cobranza implements Parcelable {

	private int numero_final;
	private String clase;
	private String tipo;
	private int sucursal;
	private int numero_comprobante;	
	private int codigo_cliente;
	private int codigo_vendedor;
	private int numero_recibo;
	private double importe_pagado;
	private double saldo;
	private String observacion;
	private long fecha;
	private long fecha_envio;
	private int estado;

	public int getNumero_final() {
		return numero_final;
	}

	public void setNumero_final(int numero_final) {
		this.numero_final = numero_final;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSucursal() {
		return sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public int getNumero_comprobante() {
		return numero_comprobante;
	}

	public void setNumero_comprobante(int numero_comprobante) {
		this.numero_comprobante = numero_comprobante;
	}

	public long getFecha() {
		return fecha;
	}

	public void setFecha(long fecha) {
		this.fecha = fecha;
	}

	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public int getCodigo_vendedor() {
		return codigo_vendedor;
	}

	public void setCodigo_vendedor(int codigo_vendedor) {
		this.codigo_vendedor = codigo_vendedor;
	}

	public long getFecha_envio() {
		return fecha_envio;
	}

	public void setFecha_envio(long fecha_envio) {
		this.fecha_envio = fecha_envio;
	}

	public int getNumero_recibo() {
		return numero_recibo;
	}

	public void setNumero_recibo(int numero_recibo) {
		this.numero_recibo = numero_recibo;
	}

	public double getImporte_pagado() {
		return importe_pagado;
	}

	public void setImporte_pagado(double importe_pagado) {
		this.importe_pagado = importe_pagado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int describeContents() {

		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {


	}

}