package org.example.demo.ordermanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.example.demo.ordermanagement.logic.api.Ordermanagement;
import org.example.demo.ordermanagement.logic.api.to.ItemEto;
import org.example.demo.ordermanagement.logic.api.to.OrderEto;

import com.devonfw.module.rest.common.api.RestService;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Ordermanagement}.
 */
@Path("/ordermanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface OrdermanagementRestService extends RestService {

  /**
   * Delegates to {@link Ordermanagement#findOrder}.
   *
   * @param id the ID of the {@link OrderEto}
   * @return the {@link OrderEto}
   */
  @GET
  @Path("/order/{id}/")
  public OrderEto findOrder(@PathParam("id") long id);

  /**
   * Delegates to {@link Ordermanagement#saveOrder}.
   *
   * @param order the {@link OrderEto} to be saved
   * @return the recently created {@link OrderEto}
   */
  @POST
  @Path("/order/")
  public OrderEto saveOrder(OrderEto order);

  /**
   * @param id ID of the {@link OrderEto} to be deleted
   */
  @DELETE
  @Path("/order/{id}/")
  public void deleteOrder(@PathParam("id") long id);

  /**
   * @param id the ID of the {@link ItemEto}
   * @return the {@link ItemEto}
   */
  @GET
  @Path("/item/{id}/")
  public ItemEto findItem(@PathParam("id") long id);

  /**
   * @param item the {@link ItemEto} to be saved
   * @return the recently created {@link ItemEto}
   */
  @POST
  @Path("/item/")
  public ItemEto saveItem(ItemEto item);

  /**
   * @param id ID of the {@link ItemEto} to be deleted
   */
  @DELETE
  @Path("/item/{id}/")
  public void deleteItem(@PathParam("id") long id);

}
