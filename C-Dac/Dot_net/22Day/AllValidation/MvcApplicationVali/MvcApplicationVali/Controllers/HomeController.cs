using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using MvcApplicationVali.Models;

namespace MvcApplicationVali.Controllers
{
    public class HomeController : Controller
    {
        private SampleEntities db = new SampleEntities();

        //
        // GET: /Default1/

        public ActionResult Index()
        {
            return View(db.MyEmployees.ToList());
        }

        //
        // GET: /Default1/Details/5

        public ActionResult Details(int id = 0)
        {
            MyEmployee myemployee = db.MyEmployees.Find(id);
            if (myemployee == null)
            {
                return HttpNotFound();
            }
            return View(myemployee);
        }

        //
        // GET: /Default1/Create

        public ActionResult Create()
        {
            return View();
        }

        //
        // POST: /Default1/Create

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(MyEmployee myemployee)
        {
            if (ModelState.IsValid)
            {
                db.MyEmployees.Add(myemployee);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(myemployee);
        }

        //
        // GET: /Default1/Edit/5

        public ActionResult Edit(int id = 0)
        {
            MyEmployee myemployee = db.MyEmployees.Find(id);
            if (myemployee == null)
            {
                return HttpNotFound();
            }
            return View(myemployee);
        }

        //
        // POST: /Default1/Edit/5

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(MyEmployee myemployee)
        {
            if (ModelState.IsValid)
            {
                db.Entry(myemployee).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(myemployee);
        }

        //
        // GET: /Default1/Delete/5

        public ActionResult Delete(int id = 0)
        {
            MyEmployee myemployee = db.MyEmployees.Find(id);
            if (myemployee == null)
            {
                return HttpNotFound();
            }
            return View(myemployee);
        }

        //
        // POST: /Default1/Delete/5

        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            MyEmployee myemployee = db.MyEmployees.Find(id);
            db.MyEmployees.Remove(myemployee);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            db.Dispose();
            base.Dispose(disposing);
        }
    }
}